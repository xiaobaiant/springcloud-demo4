package xiaoxiaobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: hys
 * @createTime: 2023年05月24日 11:41:46
 * @version:
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8006 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8006.class,args);
    }
}