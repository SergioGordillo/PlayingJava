class isPairOrNot {

    private number num; 

    public isPairOrNot(){}

    public isPairOrNot(number num = 0){
        this.num=num;
    }

    read_number (num: number): void{
        this.num = num;
    }

    print() {
        if (this.num % 2 === 0) {
            while (this.num>1) {
                System.out.println("pair number: ", this.num);
                this.num = this.num - 2;
            }
        } else {
            while(this.num > 0) {
                System.out.println("odd number", this.num);
                this.num = this.num - 2;
            }
        }
    }
}

 isPairOrNot a = new isPairOrNot();
 a.read_number(10);
 a.print();

 isPairOrNot b = new isPairOrNot();
 b.read_number(11);
 b.print();

