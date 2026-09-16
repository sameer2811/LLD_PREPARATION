package ChainOfResponsibilityDesignPattern.Middleware.models;

public class Request {

    private String ipAddress;
    private String url;
    private String method;
    private String requestBody;
    private String requestHeader;
    private String requestParam;
    private String requestQuery;
    private String requestPath;
    private String requestHost;

    public Request(RequestBuilder requestBuilder) {
        this.ipAddress = requestBuilder.ipAddress;
        this.url = requestBuilder.url;
        this.method = requestBuilder.method;
        this.requestBody = requestBuilder.requestBody;
        this.requestHeader = requestBuilder.requestHeader;
        this.requestParam = requestBuilder.requestParam;
        this.requestQuery = requestBuilder.requestQuery;
        this.requestPath = requestBuilder.requestPath;
        this.requestHost = requestBuilder.requestHost;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public String getRequestQuery() {
        return requestQuery;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public String getRequestHost() {
        return requestHost;
    }

    public static class RequestBuilder {
        private String ipAddress;
        private String url;
        private String method;
        private String requestBody;
        private String requestHeader;
        private String requestParam;
        private String requestQuery;
        private String requestPath;
        private String requestHost;

        public RequestBuilder setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public RequestBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public RequestBuilder setMethod(String method) {
            this.method = method;
            return this;
        }

        public RequestBuilder setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public RequestBuilder setRequestHeader(String requestHeader) {
            this.requestHeader = requestHeader;
            return this;
        }

        public RequestBuilder setRequestParam(String requestParam) {
            this.requestParam = requestParam;
            return this;
        }

        public RequestBuilder setRequestQuery(String requestQuery) {
            this.requestQuery = requestQuery;
            return this;
        }

        public RequestBuilder setRequestPath(String requestPath) {
            this.requestPath = requestPath;
            return this;
        }

        public RequestBuilder setRequestHost(String requestHost) {
            this.requestHost = requestHost;
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }
}