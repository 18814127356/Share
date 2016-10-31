package cc.lixiaohui.share.client;

import cc.lixiaohui.share.util.lifecycle.LifeCycle;

/**
 * 代表客户端
 * 用例:
 * <pre>
 * IShareClient client = new ShareClientBuilder().host("localhost").port(8888).build();
 * </pre>
 * 
 * 更多参数配置可参考{@link Configuration}
 * 
 * @author lixiaohui
 * @date 2016年10月31日 下午3:53:34
 */
public interface IShareClient extends LifeCycle, IMessageListener{
	
}
