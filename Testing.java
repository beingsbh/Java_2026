
class Testing {

    void m() {
        System.out.println(this);//prints same reference ID   
    }

    public static void main(String args[]) {
        Testing obj = new Testing();
        System.out.println(obj);//prints the reference ID    
        obj.m();
    }
}
