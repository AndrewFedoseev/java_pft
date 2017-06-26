package com.stqa.pft.tests;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.stqa.pft.model.GroupData;
import com.stqa.pft.model.Groups;
import com.thoughtworks.xstream.XStream;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by Andrew on 4/6/2017.
 */
public class GroupCreationTests extends TestBase {

    @DataProvider
    public Iterator<Object[]> validGroupsFromJson() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.json")));
        String json = "";
        String line = reader.readLine();
        while (line != null) {
            json += line;
            line = reader.readLine();
        }
        Gson gson = new Gson();
        List<GroupData> groups = gson.fromJson(json, new TypeToken<List<GroupData>>() {
        }.getType()); //List<GroupData>.class
        return groups.stream().map((g) -> new Object[]{g}).collect(Collectors.toList()).iterator();
    }

    @DataProvider
    public Iterator<Object[]> validGroupsFromXml() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.xml")));
        String xml = "";
        String line = reader.readLine();
        while (line != null) {
            xml += line;
            line = reader.readLine();
        }
        XStream xStream = new XStream();
        xStream.processAnnotations(GroupData.class);
        List<GroupData> groups = (List<GroupData>) xStream.fromXML(xml);
        return groups.stream().map((g) -> new Object[]{g}).collect(Collectors.toList()).iterator();
    }

    @Test(dataProvider = "validGroupsFromJson")
    public void testGroupCreation(GroupData group) {
        app.goTo().groupPage();
        Groups before = app.group().all();
        app.group().create(group);
        assertThat(app.group().count(), equalTo(before.size() + 1));
        Groups after = app.group().all();
        assertThat(after, equalTo(
                before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }

    @Test
    public void testBadGroupCreation() {
        app.goTo().groupPage();
        Groups before = app.group().all();
        GroupData group = new GroupData().withName("test2'");
        app.group().create(group);
        assertThat(app.group().count(), equalTo(before.size()));
        Groups after = app.group().all();
        assertThat(after, equalTo(before));
    }
}

