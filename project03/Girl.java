package project03;

public class Girl {
    private String name;
    private int age;

    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     * @param girl
     * @return  正数，当前对象大；附属当前对象小；0当前对象与形参对象相等
     */
    public int comper(Girl girl){
        /*if(this.age > girl.age){
            return 1;
        }else if (this.age < girl.age){
            return -1;
        }else {
            return 0;
        }*/
        return this.age - girl.age;
    }
}
