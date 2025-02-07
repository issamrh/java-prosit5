public non-sealed class Aquatic extends Animal  {

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    protected String habitat;



    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public  void swim(){
        System.out.println("the Aquatic swim");
    };

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }




}