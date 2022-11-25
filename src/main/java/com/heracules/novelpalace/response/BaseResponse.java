package com.heracules.novelpalace.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"message", "result"})
public class BaseResponse <T>{
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;

    // 요청이 성공했을 때, 성공 메세지와 응답으로 보내야하는 responseDTO 객체로 응답을 생성한다.
    public BaseResponse(T result){
        this.message = "요청에 성공하였습니다.";
        this.result = result;
    }

    // 요청이 실패했을 때, 실패 메시지로 응답을 생성한다.
    public BaseResponse(String message){
        this.message = message;
    }
}
