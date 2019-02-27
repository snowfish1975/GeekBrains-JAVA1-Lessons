class Animal {

    private float maxRunDistance;
    private float maxSwimDistance;
    private float maxJumpHeight;

    void run(float distance){
        System.out.println("RUN:"+(distance <= getMaxRunDistance()) +" asked distance:"+distance+"/max distance:"+getMaxRunDistance());
    }

    void jump(float height){
        System.out.println("JUMP:"+(height <= getMaxJumpHeight()) +" asked distance:"+height+"/max distance:"+getMaxJumpHeight());
    }

    void swim(float distance){
        System.out.println("SWIM:"+(distance <= getMaxSwimDistance()) +" asked distance:"+distance+"/max distance:"+getMaxSwimDistance());
    }

    private float getMaxRunDistance() {
        return maxRunDistance;
    }
    void setMaxRunDistance(float maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    private float getMaxSwimDistance() {
        return maxSwimDistance;
    }
    void setMaxSwimDistance(float maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    private float getMaxJumpHeight() {
        return maxJumpHeight;
    }
    void setMaxJumpHeight(float maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

}
