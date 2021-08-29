package org.devlos.rest_client.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Req<T> {

    private Header header;

    //Body가 동적으로 생성될 수 있음. 이것을 제너릭으로 처리함
    private T resBody;

    public static class Header {
        private String responseCode;
    }
}
