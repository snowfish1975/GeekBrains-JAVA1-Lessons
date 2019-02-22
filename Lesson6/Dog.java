class Dog extends Animal {

    Dog() {
        setMaxJumpHeight(0.5f);
        setMaxRunDistance(500f + (int) (Math.random() * 200 - 100));
        setMaxSwimDistance(10f);
    }

}
