package io.github.guoshiqiufeng.lokitest.interceptor;

import io.github.guoshiqiufeng.loki.support.core.pipeline.PipelineContext;
import io.github.guoshiqiufeng.loki.support.core.pipeline.PipelineProcess;
import io.github.guoshiqiufeng.loki.support.core.pipeline.model.ProducerRecordModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author yanghq
 * @version 1.0
 * @since 2024/1/31 14:38
 */
@Slf4j
@Component
public class SendInterceptor implements PipelineProcess<ProducerRecordModel> {

    /**
     * 是否支持
     *
     * @param context 内容
     * @return 是否支持 true 支持 false 不支持
     */
    @Override
    public boolean support(PipelineContext<ProducerRecordModel> context) {
        return "loki".equals(context.getProcessModel().getTopic());
    }

    /**
     * 处理
     *
     * @param context 内容
     */
    @Override
    public void process(PipelineContext<ProducerRecordModel> context) {
        log.debug("SendInterceptor context:{}", context);
        // context.setProcessModel(null);
    }
}
