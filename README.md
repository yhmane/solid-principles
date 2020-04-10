# Solid 원칙

## branch
* feature-srp
* feature-ocp
* feature-lsp
* feature-isp
* feature-dip

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