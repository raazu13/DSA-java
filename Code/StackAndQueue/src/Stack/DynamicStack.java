package Stack;

public class DynamicStack extends CustomStack{

    DynamicStack(){
        super();
    }

    DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int data) throws StackException {
        if(isFull()){
            int[] temp= new int[this.data.length*2];

            for(int i=0; i<this.data.length; i++){
                temp[i]=this.data[i];
            }

            this.data=temp;
        }
        return super.push(data);
    }
}
