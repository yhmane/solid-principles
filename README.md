# Solid 원칙

## branch
* feature-srp
* feature-ocp
* feature-lsp
* feature-isp
* feature-dip

##
### feature-srp (Solid Responsibility Principle)
 * 소프트웨어의 부품 (클래스, 함수 .. 등)은 단 하나의 책임만을 가져야 합니다. 
 * 외부에 요청으로 인해 변경사항이 발생하여도, 다른 클래스에 영향을 미치지 않도록 설계하는 것을 원칙으로 설계합니다. 
 * 즉, 응집도는 높이고 결합도는 낮은 프로그램을 설계하는 것입니다.
 
#### feature-srp Structure
 * before
    * PrintService -> print, scan
 * after
    * PrintService -> print
    * ScanService -> scan
##
### feature-ocp (Open Closed Principle)
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
