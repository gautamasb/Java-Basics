public class eight {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            j=20/i;
        } catch (Exception e) {
            // TODO: handle exception
            j=20/2;
            System.out.println("There is an Exception "+e);
        }
        finally{
            System.out.println("Please Handle the Exception");
        }
        System.out.println(j);
    }
}
