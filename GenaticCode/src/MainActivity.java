public class MainActivity {
    public static void main(String[] args) {
        
    	NamePrint<Integer, String> example = new NamePrint<>();

        example.setData(10);
        example.setData1("Hello");

        System.out.println(example);

        int data = example.getData();
        String data1 = example.getData1();
        System.out.println("Data: " + data); 
        System.out.println("Data1: " + data1);
    }
}
