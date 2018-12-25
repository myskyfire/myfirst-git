package cn.edu.ysu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p><b>Description：</b></p>
 * <p>main class</p>
 * <p><b>createTime: </b></p>
 * <p>2018/6/12 15:02</p>
 *
 * @author huangjinzhao
 * @since V1.0
 */

public class MainClass {
    public static void main(String[] args) {
        /*new Thread(()->{
            try {
                RpcExporter.exporter("localhost",9090);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        RpcImporter<EchoService> importer = new RpcImporter<>();
        EchoService echoService = importer.importer(EchoServiceImpl.class,new InetSocketAddress("localhost",9090));
        System.out.println(echoService.echo("java"));
*/
        List<Car> list = Arrays.asList(new Car(1,"a"),new Car(2,"b"),new Car(3,"c"),new Car(4,"d"));
        List<Car> carList = list.stream().peek(car -> {
            if(car.getCarNo()%4==0){
                car.setCarNo(car.getCarNo()+6);
            }
        }).filter(car -> car.getCarNo()%10!=0).collect(Collectors.toList());
        System.out.println(carList);
    }

   static class Car{
        int carNo;

        public int getCarNo() {
            return carNo;
        }

        public void setCarNo(int carNo) {
            this.carNo = carNo;
        }

        public String getCardName() {
            return cardName;
        }

        public void setCardName(String cardName) {
            this.cardName = cardName;
        }

        String cardName;
        Car(int carNo,String cardName){
            this.cardName=cardName;
            this.carNo=carNo;
        }
        @Override
        public String toString(){
            return "cardNo:"+carNo+",cardName"+cardName;

        }

    }
}
