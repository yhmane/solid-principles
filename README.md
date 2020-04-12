# Solid 원칙

## branch
* feature-srp
* feature-ocp
* feature-lsp
* feature-isp
* feature-dip

##
### feature-srp (Solid Responsibility Principle) 단일 책임 원칙
 * 소프트웨어의 부품 (클래스, 함수 .. 등)은 단 하나의 책임만을 가져야 합니다. 
 * 외부에 요청으로 인해 변경사항이 발생하여도, 다른 클래스에 영향을 미치지 않도록 설계하는 것을 원칙으로 설계합니다. 
 * 즉, 응집도는 높이고 결합도는 낮은 프로그램을 설계하는 것입니다.
 
#### feature-srp Structure
 * before
    * Human -> research, teach, catchThief, patrol, pramgram, debug, spadeWork, paint
 * after
    * Professor -> research, teach
    * PoliceOfficer -> catchThief, patrol
    * Programmer -> pramgram, debug
    * InteriorWorker -> spadeWork, paint
##
### feature-ocp (Open Closed Principle) 개방 폐쇄 원칙
 * 소프트웨어는 확장(기능)에는 열려 있어야 하고, 주변 변화에는 닫혀 있어야 합니다. 
 * 인터페이스를 사용함으로써, 확장성을 높이고 클래스에 직접 수정을 막아주는 원칙입니다.
 
#### feature-ocp Structure
* before
    * SMouse
    * Computer
* after
    * AMouse
    * OcpComputer
    * OcpMouse (interface)
##
### feature-lsp (Liskov Substition Principle) 리스코프 치환 원칙
* 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상적으로 동작해야 합니다.

#### feature-lsp Structure
* before
    * BeforeRectangle
    * BeforeSquare
* after
    * Shape
    * Rectangle
    * Square

##
### feature-isp (Interface Sgregation Principle) 인터페이스 분리 법칙
* 클라이언트가 자신이 이용하지 않는 메서드에 의존하지 않아야 한다는 원칙입니다.
* 클래스가 사용하는 기능만 제공하도록 인터페이스를 분리하는 것 입니다.
* 하나의 일반적인 인터페이스보다는, 여러 개의 구체적인 인터페이스가 낫습니다.

#### feature-isp Structure
* before
    * PrintService -> print, scan
* after
    * PrintService -> print
    * ScanService -> scan
     
##
### feature-dip (Dependency Inversion Principle) 의존성 역전 법칙
* 추상화된 것은 구체적인 것에 의존하면 안된다. 구체적인 것이 추상화된 것에 의존해야 합니다.
* 자주 변경되는 구체(Concrete) 클래스에 의존하면 안됩니다.

#### feature-dip Structure
* before
    * Car
    * SnowTire
* after
    * DipCar
    * Tire (interface)
    * ChainTire
    * BigTire