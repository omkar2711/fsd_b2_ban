public class StringBuilderImp {

    public static String modifyString(){
        StringBuffer sb1 = new StringBuffer("Hello");

        sb1.append("World");

        sb1.append("!");

        sb1.insert(5 ,"-");

    

    //    sb1.delete(5, 12);
    //    sb1.deleteCharAt(11);

        sb1.replace(5, 12, " Java");

        sb1.reverse();

        System.out.println(sb1);

        return sb1.toString();
    }
    public static void main(String[] args) {
        System.out.println(modifyString());
    }
}
