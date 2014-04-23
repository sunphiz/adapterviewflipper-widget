# 안드로이드 AdapterViewFlipper 예제 #
* 돌아가는 최초의 ViewFlipper 위젯 샘플입니다.
  * AdapterViewFlipper를 이용한 appwidget이 가능하다고 android.com에 나와있지만, 돌아가는 샘플은 찾을수가 없어 만들게 되었습니다.
* 간단합니다.
* 가장 많이 사용하는 기능이 구현되어 있습니다.
  * 페이지 이동 : 1 <-> 2
  * 새로고침 : 변경된데이터를 화면에 반영
  * 가로/세로 모드 변환

<img src="http://sunphiz.me/wp/wp-content/uploads/2013/08/device-2013-08-21-115836-168x300.png" alt="screenshot of this widget"/>

## 레이아웃 ##
* 두개의 클래스로 구성됩니다.
  * WidgetProvider ; AppWidgetProvider 클래스를 확장합니다. 브로드캐스트를 받아 위젯이 동작하는 역할입니다.
  * WidgetService ; RemoteViewsService 클래스를 확장합니다. RemoteViewsService.RemoteViewFactory 클래스를 이너클래스로 가지고 있습니다.

## 라이센스 ##
The MIT License (MIT)

Copyright (c) <year> <copyright holders>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.


# Android AppWidget with AdapterViewFlipper #
* The first ViewFlipper widget sample 
  * I could not find any sample with ApdaterViewFlipper. So, I've made. I wish this would be helpful.
* Simple structure
* Most common features are implemented.
  * Paging between 1 and 2
  * Refresh to apply and redraw data changed
  * Orientation changed

## layout ##
* There are two classes.
  * WidgetProvider ; extends AppWidgetProvider class.
  * WidgetService ; extends RemoteViewsService class. It has RemoteViewsService.RemoteViewFactory class, too.

## License ##
The MIT License (MIT)

Copyright (c) <year> <copyright holders>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
