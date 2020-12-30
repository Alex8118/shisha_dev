package com.tobacco.servicies;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.tobacco.dto.AuthUserEntityDto;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class CurrentUserDetails {

    public static AuthUserEntityDto getUserDetails(String jwtToken) throws UnirestException, IOException {

        HttpResponse<String> response = Unirest.get("https://shishaproject.eu.auth0.com/userinfo/")
                .header("authorization", jwtToken)
                .asString();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper = objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        AuthUserEntityDto authUserEntityDto = objectMapper.readValue(response.getRawBody(), AuthUserEntityDto.class);

        return authUserEntityDto;
    }

    public static Double getUserIdFromToken(String jwtToken) throws UnirestException, IOException {

        var sub = getUserDetails(jwtToken).getSub().split("\\|");
        String partOfSub = (sub[1]);
        return Double.parseDouble(partOfSub);
    }

    public static String getUserId() throws JSONException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Authentication context =  SecurityContextHolder.getContext().getAuthentication();
        String jsonString = mapper.writeValueAsString(context);
        JSONObject obj = new JSONObject(jsonString);
        String subUserId = obj.getJSONObject("principal").getJSONObject("claims").getString("sub");
        String[] userIdFull = subUserId.split("\\|");
        String userId = (userIdFull[1]);

        return userId;
    }

}


