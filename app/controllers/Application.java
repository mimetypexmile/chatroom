package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.io.IOException;
import java.util.*;

import models.*;
import play.mvc.results.Result;

public class Application extends Controller {

    //private static Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void index() {
        render();
    }

    public static void chatIndex(String entryName,@Required String content){
        String identity = "会员";
        if(entryName == null){
            entryName = "游客NPC";
            identity = "游客";
        }

        render(entryName,identity);
        render(content);
    }
    public static Result speak(String currentSpeaker, @Required final String content){
        Result result = new Result() {
            @Override
            public void apply(Http.Request request, Http.Response response) {
                try {
                    response.out.write(content.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        return result;
    }
}