import org.apache.log4j.Logger;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;


public class ZookeeperDemo implements Watcher{

    Logger logger = Logger.getLogger(ZookeeperDemo.class);

    protected CountDownLatch countDownLatch = new CountDownLatch(1);

    //����ʱ��
    private static final int SESSION_TIME = 2000;

    public static ZooKeeper zooKeeper = null;

    /**
     * ������б��������¼�
     * @param watchedEvent
     */
    public void process(WatchedEvent watchedEvent) {
        logger.info("�յ��¼�֪ͨ��" + watchedEvent.getState());
        if(watchedEvent.getState() == Event.KeeperState.SyncConnected){
            countDownLatch.countDown();
        }
    }

    public void connect(String hosts){
        try{
            if(zooKeeper == null){
                //zk�ͻ����������ǽ�ZK��������е�ַ��������
                zooKeeper = new ZooKeeper(hosts,SESSION_TIME,this);
                logger.info(" ZooKeeper ���Ӵ����ɹ��� hosts is:"+hosts);
                logger.error(" ZooKeeper ���Ӵ����ɹ��� hosts is:"+hosts);
                logger.warn(" ZooKeeper ���Ӵ����ɹ��� hosts is:"+hosts);
                //ʹ��countDownLatch��await
                countDownLatch.await();
            }

        }catch(IOException e){
            logger.error("���Ӵ���ʧ�ܣ����� IOException :" + e.getMessage());
        } catch (InterruptedException e) {
            logger.error("���Ӵ���ʧ�ܣ����� InterruptedException :" + e.getMessage());
        }
    }

    /**
     * �ر�����
     */
    public void close(){
        try {
            if (zooKeeper != null) {
                zooKeeper.close();
            }
        }catch (InterruptedException e){
            logger.error("�ͷ����Ӵ��� ��"+ e.getMessage());
        }
    }
}