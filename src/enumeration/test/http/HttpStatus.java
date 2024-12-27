package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "Bad Request"), NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final Integer code;
    private final String message;

    HttpStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(Integer httpCodeInput) {
        for(HttpStatus httpStatus : values()) {
            if(httpStatus.getCode().equals(httpCodeInput)) {
                return httpStatus;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        if(this.code.equals(200)) {
            return true;
        }
        return false;
    }
}




