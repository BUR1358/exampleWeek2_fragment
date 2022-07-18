# exampleWeek2_fragment

![image](https://user-images.githubusercontent.com/77270310/178551154-3498b1b9-5ba3-4ac1-8d1e-9064d4973709.png)

![image](https://user-images.githubusercontent.com/77270310/178551708-215f57e5-6d7a-4460-91ae-6ffcf288fa20.png)

2.1. Сделать новое мобильное приложение в котором завести активити с тремя фрагментами, один открывается из другого, и из последнего открывается AlertDialog

2.2. Обложить логами методы жизненного цикла

2.3. Открывать-закрывать-сворачивать экраны и смотреть что в какой последовательности вызывается

2.4. Посмотреть картинку про жизненный цикл Fragment в документации, выяснить все ли понятно, если что-то непонятно, надо это прояснить
```
Activity LifeCycle                           Fragment LifeCycle
onCreate()                                    onAttach()
    |                                              |
onStart()______onRestart()                     onCreate()
    |             |                                |
onResume()        |                            onCreateView()
    |             |                                |
onPause()         |                            onActivityCreated()
    |             |                                |
onStop()__________|                             onStart()
    |                                              |
onDestroy()                                     onResume()
                                                   |
                                                onPause()
                                                   |
                                                onStop()
                                                   |
                                                onDestroyView()
                                                   |
                                                onDestroy()
                                                   |
                                                onDetach()
```
