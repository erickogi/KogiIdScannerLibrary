# KogiIdScannerLibrary
Shows how to use the scanner library in an android project

To use the library the following in the build.gradle(project)
```java
repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
    
```
    
    
Then add the dependancy

```java
   
       implementation 'com.github.erickogi:Idscanner:v1.0.0'
```java


In the activity you plan to use the idscanner, start the scannining activity 

```java
     startActivityForResult(new Intent(MainActivity.this, CaptureActivity.class), 1001);
     
```
     
     
Implement  onActivityResult to get the kipande object.
     
```java
       @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1001){
            if(resultCode== Activity.RESULT_OK){


                results.setText("MY D____"+new Gson().toJson(data));

                Kipande kipande=((Kipande)data.getParcelableExtra("Data") );
                results.setText("MY D____"+new Gson().toJson(data));


            }


        }
    }
    
```

