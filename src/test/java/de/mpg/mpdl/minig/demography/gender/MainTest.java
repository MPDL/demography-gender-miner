package de.mpg.mpdl.minig.demography.gender;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;
import org.marc4j.MarcStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'vlad' at '9/16/14 2:34 PM' with Gradle 2.0
 *
 * @author vlad, @date 9/16/14 2:34 PM
 */
public class MainTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainTest.class);


    @Test
    public void testMarcStreamReader() throws Exception {
        InputStream input = Main.class.getResourceAsStream(
                Main.RESOURCES_MARC);
        MarcStreamReader reader = new MarcStreamReader(input);
        assertNotNull(input);
        assertNotNull(reader);
        input.close();
    }


    @Test
    public void testUnmarshal() throws Exception {
        String json = "[" +
                "{\"name\":\"peter\",\"gender\":\"male\",\"probability\":\"0.99\",\"count\":796}," +
                "{\"name\":\"pauline\",\"gender\":\"female\",\"probability\":\"1.00\",\"count\":300}" +
        "]";
        ObjectMapper mapper = new ObjectMapper();
        List<Person> asList = mapper.readValue(json, new TypeReference<List<Person>>() { });
        assertNotNull(asList);
        assertTrue( asList.size() == 2 );
    }
}