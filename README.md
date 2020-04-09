# Solid 원칙

## branch
* feature-srp
* feature-ocp
* feature-lsp
* feature-isp
* feature-dip

### feature-srp
 소프트웨어의 부품 (클래스, 함수 .. 등)은 단 하나의 책임만을 가져야 합니다. 여기서 책임이란 (=기능) 이라고 이해하시면 되는데요, 외부에 요청으로 인해 변경사항이 발생하여도, 다른 클래스에 영향을 미치지 않도록 설계하는 것을 원칙으로 설계합니다. 즉, 응집도는 높이고 결합도는 낮은 프로그램을 설계하는 것입니다.

 public interface PrintService
 public interface ScanService 
 기존 PrintService에는 print(), scan() 기능이 모두 존재하였다. 하지만, 출시되는 프린터에 출력과 스캔 기능이 모두 있지 않기 때문에 interface를 분리하여 print()와 scan()을 분리하여 주었다.
  
