package com.project.dabang.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.gson.Gson;
import com.project.dabang.dto.RawRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Component
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CustomJsonPassing {

    public RequestJson jasonPassingUsingGson(RawRequestDto rawRequestDto) throws JsonProcessingException { // RawRequestDto 생성 후 테스트 해봐야 함

        ObjectMapper mapper = new ObjectMapper();
        String jsonToString = mapper.writeValueAsString(rawRequestDto);
        RequestJson requestJson = new Gson().fromJson(jsonToString, RequestJson.class);
        return requestJson;
    }
}
