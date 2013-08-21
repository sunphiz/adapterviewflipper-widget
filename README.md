# 안드로이드 AdapterViewFlipper 예제 #
* AdapterViewFlipper를 이용한 appwidget이 가능하다고 android.com에 나와있지만, 돌아가는 샘플은 찾을수가 없어 만들게 되었습니다.

<img src="http://sunphiz.me/wp/wp-content/uploads/2013/08/device-2013-08-21-115836-168x300.png" alt="screenshot of this widget"/>

## 레이아웃 ##
* 두개의 클래스로 구성됩니다.
  * WidgetProvider ; AppWidgetProvider 클래스를 확장합니다. 브로드캐스트를 받아 위젯이 동작하는 역할입니다.
  * WidgetService ; RemoteViewsService 클래스를 확장합니다. RemoteViewsService.RemoteViewFactory 클래스를 이너클래스로 가지고 있습니다.

## 라이센스 ##
* MIT 라이센스를 따릅니다. 매우 자유롭습니다. (http://opensource.org/licenses/mit-license.php)


# Android AppWidget with AdapterViewFlipper #
* I could not find any sample with ApdaterViewFlipper. So, I've made. I wish this would be helpful.

## layout ##
* There are two classes.
  * WidgetProvider ; extends AppWidgetProvider class.
  * WidgetService ; extends RemoteViewsService class. It has RemoteViewsService.RemoteViewFactory class, too.

## License ##
* MIT license (http://opensource.org/licenses/mit-license.php)
