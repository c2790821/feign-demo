這是一個feign-demo
裡面示範了基本的feignClient使用方式，可以先把他當成一個就是對外請求的工具就好了

使用說明：先啟用Service跟Main，之後可以呼叫
http://localhost:8080/hello/yourName
就完成本次demo了

解釋：Main專案底下的重點就是HelloService身上多了一個@FeignClient的標籤，这段代码中的 @FeignClient 注解定义了一个名为 "hello-service" 的 Feign 客户端，请求的地址为 "http://localhost:8081/hello"
。调用 HelloService 接口中的 greeting 方法时，Feign 会自动生成 HTTP GET 请求，并将参数值替换到请求路径中的 {name} 参数中，然后发送请求到服务提供者的 "http://localhost:8081/hello/{name}" 接口，最后将响应结果转换为接口方法的返回值并返回给调用方。

Service專案底下的重點就是提供一個接口(controller)，讓Main專案底下的HelloService可以調用