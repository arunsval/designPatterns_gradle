package factory_method;

public abstract class Pizza {
    String name;

    public String getName() {
        return this.name;
    }

    public void prepare() {
        System.out.println("Store preparing your pizza");
    }

    public void bake() {
        System.out.println("Your Pizza is being baked..");
    }

    public void cut() {
        System.out.println("You pizza is almost ready");
    }

    public void delivery() {
        System.out.println("Your pizza is ready");
    }
}
