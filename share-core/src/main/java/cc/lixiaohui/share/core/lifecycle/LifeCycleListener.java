package cc.lixiaohui.share.core.lifecycle;

import java.util.EventListener;

public interface LifeCycleListener extends EventListener {
	void lifeCycleEvent(LifeCycleEvent e);
}
