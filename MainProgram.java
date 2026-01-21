
class B {

    MainProgram obj;

    B(MainProgram obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);//using data member of MainProgram class    
    }
}

class MainProgram {

    int data = 10;

    MainProgram() {
        B b = new B(this);
        b.display();
    }

    public static void main(String args[]) {
        MainProgram a = new MainProgram();
    }
}
