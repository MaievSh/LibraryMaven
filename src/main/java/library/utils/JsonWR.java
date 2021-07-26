package library.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;
import org.apache.log4j.Logger;

public class JsonWR {

    private final static Logger LOGGER = Logger.getLogger(JsonWR.class);

    public String JavaToJsonString (Object obj) {
        String jsonToStr = "";
        try {
            jsonToStr = new ObjectMapper().writeValueAsString(obj);
           LOGGER.info("convertation finished!");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonToStr;
    }


    public PictureBooks convertJsonStrToPOJO(String jsonStr) {
        PictureBooks pictureBooks  = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            pictureBooks  = mapper.readValue(jsonStr, PictureBooks.class);
            LOGGER.info("convert to POJO, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return pictureBooks;
    }
}
