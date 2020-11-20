public class ZookeeperCliTest {
    public static void main(String[] args){
        //定义父子类节点路径
        String rootPath = "/ZookeeperRoot01";
        String childPath1 = rootPath+ "/child101";
        String childPath2 = rootPath+ "/child201";

        //ZookeeperOperation操作API
       // ZookeeperOperation zookeeperOperation = new ZookeeperOperation();

        //连接Zookeeper服务器
        ZookeeperDemo zookeeperDemo =new ZookeeperDemo();
        zookeeperDemo.connect("127.0.0.1:2181");
/*
        //创建节点
        if(zookeeperOperation.createZNode(rootPath,"<父>父节点数据")){
            System.out.println("节点 [ " +rootPath + " ],数据 [ " + zookeeperOperation.readData(rootPath)+" ]");
        }

        // 创建子节点, 读取 + 删除
        if ( zookeeperOperation.createZNode( childPath1, "<父-子(1)>节点数据" ) ) {
            System.out.println( "节点[" + childPath1 + "]数据内容[" + zookeeperOperation.readData( childPath1 ) + "]" );
            zookeeperOperation.deteleZKNode(childPath1);
            System.out.println( "节点[" + childPath1 + "]删除值后[" + zookeeperOperation.readData( childPath1 ) + "]" );
        }

        // 创建子节点, 读取 + 修改
        if ( zookeeperOperation.createZNode(childPath2, "<父-子(2)>节点数据" ) ) {
            System.out.println( "节点[" + childPath2 + "]数据内容[" + zookeeperOperation.readData( childPath2 ) + "]" );
            zookeeperOperation.updateZKNodeData(childPath2, "<父-子(2)>节点数据,更新后的数据" );
            System.out.println( "节点[" + childPath2+ "]数据内容更新后[" + zookeeperOperation.readData( childPath2 ) + "]" );
        }

        // 获取子节点
        List<String> childPaths = zookeeperOperation.getChild(rootPath);
        if(null != childPaths){
            System.out.println( "节点[" + rootPath + "]下的子节点数[" + childPaths.size() + "]" );
            for(String childPath : childPaths){
                System.out.println(" |--节点名[" +  childPath +  "]");
            }
        }
        // 判断节点是否存在
        System.out.println( "检测节点[" + rootPath + "]是否存在:" + zookeeperOperation.isExists(rootPath)  );
        System.out.println( "检测节点[" + childPath1 + "]是否存在:" + zookeeperOperation.isExists(childPath1)  );
        System.out.println( "检测节点[" + childPath2 + "]是否存在:" + zookeeperOperation.isExists(childPath2)  );
*/

        zookeeperDemo.close();
    }

}