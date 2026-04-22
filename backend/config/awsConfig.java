package trippy.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.auth.credentials.*;

@Configuration
public class awsConfig {

    @Bean
    public SqsClient sqsClient() {
        return SqsClient.builder()
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(
                        StaticCredentialsProvider.create(
                                AwsBasicCredentials.create("YOUR ACCESS KEY", "YOUR SECRET ACCESS KEY")
                        )
                )
                .build();
    }

    @Bean
    public SesClient sesClient() {
        return SesClient.builder()
                .region(Region.AP_SOUTH_1)
                .credentialsProvider(
                        StaticCredentialsProvider.create(
                                AwsBasicCredentials.create("YOUR ACCESS KEY", "YOUR SECRET ACCESS KEY")
                        )
                )
                .build();
    }
}