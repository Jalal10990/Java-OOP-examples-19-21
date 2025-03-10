 class Int {

    private int valu;

    Int(){
        valu = 0;
    }
    Int(int valu){
        this.valu = valu;
    }

    public void display(){
        System.out.println("value: "+valu);
    }
    //method adding
// Int I is capital because nextvalu is object of Int class like object passing
    public void add(Int nextValu){
        this.valu += nextValu.valu;
    }
    public static void main(String[] args) {
        
        Int result = new Int();

        Int int1 = new Int(5);
        Int int2 = new Int(9);

        result.add(int1);
        result.add(int2);

        result.display();


    }
}
