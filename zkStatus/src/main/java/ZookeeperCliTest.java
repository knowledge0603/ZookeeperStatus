public class ZookeeperCliTest {
    public static void main(String[] args){
        //���常����ڵ�·��
        String rootPath = "/ZookeeperRoot01";
        String childPath1 = rootPath+ "/child101";
        String childPath2 = rootPath+ "/child201";

        //ZookeeperOperation����API
       // ZookeeperOperation zookeeperOperation = new ZookeeperOperation();

        //����Zookeeper������
        ZookeeperDemo zookeeperDemo =new ZookeeperDemo();
        zookeeperDemo.connect("127.0.0.1:2181");
/*
        //�����ڵ�
        if(zookeeperOperation.createZNode(rootPath,"<��>���ڵ�����")){
            System.out.println("�ڵ� [ " +rootPath + " ],���� [ " + zookeeperOperation.readData(rootPath)+" ]");
        }

        // �����ӽڵ�, ��ȡ + ɾ��
        if ( zookeeperOperation.createZNode( childPath1, "<��-��(1)>�ڵ�����" ) ) {
            System.out.println( "�ڵ�[" + childPath1 + "]��������[" + zookeeperOperation.readData( childPath1 ) + "]" );
            zookeeperOperation.deteleZKNode(childPath1);
            System.out.println( "�ڵ�[" + childPath1 + "]ɾ��ֵ��[" + zookeeperOperation.readData( childPath1 ) + "]" );
        }

        // �����ӽڵ�, ��ȡ + �޸�
        if ( zookeeperOperation.createZNode(childPath2, "<��-��(2)>�ڵ�����" ) ) {
            System.out.println( "�ڵ�[" + childPath2 + "]��������[" + zookeeperOperation.readData( childPath2 ) + "]" );
            zookeeperOperation.updateZKNodeData(childPath2, "<��-��(2)>�ڵ�����,���º������" );
            System.out.println( "�ڵ�[" + childPath2+ "]�������ݸ��º�[" + zookeeperOperation.readData( childPath2 ) + "]" );
        }

        // ��ȡ�ӽڵ�
        List<String> childPaths = zookeeperOperation.getChild(rootPath);
        if(null != childPaths){
            System.out.println( "�ڵ�[" + rootPath + "]�µ��ӽڵ���[" + childPaths.size() + "]" );
            for(String childPath : childPaths){
                System.out.println(" |--�ڵ���[" +  childPath +  "]");
            }
        }
        // �жϽڵ��Ƿ����
        System.out.println( "���ڵ�[" + rootPath + "]�Ƿ����:" + zookeeperOperation.isExists(rootPath)  );
        System.out.println( "���ڵ�[" + childPath1 + "]�Ƿ����:" + zookeeperOperation.isExists(childPath1)  );
        System.out.println( "���ڵ�[" + childPath2 + "]�Ƿ����:" + zookeeperOperation.isExists(childPath2)  );
*/

        zookeeperDemo.close();
    }

}