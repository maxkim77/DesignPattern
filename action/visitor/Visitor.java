interface ComputerPartVisitor {
    void visit(Keyboard keboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Computer computer);
}

interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        computerPartVisitor.visit(this);
    }
}

class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
// ConcreteVisitor 클래스 - ComputerPartDisplayVisitor
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }
}
