# LandMarkBookKotlin 📱

LandMarkBookJava projesinin Kotlin ve Jetpack Compose versiyonudur.

## 🎯 Proje Açıklaması

LandMarkBookKotlin, "Dünya anıtları" uygulamasıdır. Kullanıcılar dünya çapındaki ünlü anıtları görebilir ve her anıt hakkında detaylı bilgi alabilirler.

## 📁 Proje Yapısı

```
LandMarkBookKotlin/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/gursel/landmarkbookkotlin/
│   │   │   │   ├── MainActivity.kt           # Ana aktivite, Navigation kurulumu
│   │   │   │   ├── data/
│   │   │   │   │   └── Landmark.kt            # Landmark veri sınıfı ve örnek veriler
│   │   │   │   └── ui/
│   │   │   │       ├── screens/
│   │   │   │       │   ├── MainScreen.kt      # Ana ekran (Landmark listesi)
│   │   │   │       │   └── DetailsScreen.kt   # Detay ekranı
│   │   │   │       └── theme/
│   │   │   │           └── Theme.kt           # Tema tanımları
│   │   │   ├── res/
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   └── themes.xml
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle
├── gradle/
│   └── libs.versions.toml
├── build.gradle (root)
├── settings.gradle
└── gradle.properties
```

## 🚀 Teknolojiler

- **Kotlin** - Modern Java alternatifi
- **Jetpack Compose** - Deklaratif UI framework
- **Material 3** - Material Design 3 bileşenleri
- **Jetpack Navigation** - Ekranlar arasında navigasyon
- **Coil** - Resim yükleme kütüphanesi

## 📊 Java vs Kotlin + Compose Farkları

### Java Versiyonu (Eski)
```
├─ MainActivity.java (XML binding ile)
├─ DetailsActivity.java (XML binding ile)
├─ LandmarkAdapter.java (RecyclerView adapter)
├─ Landmark.java (Seri hale getirilebilir sınıf)
└─ XML Layout Dosyaları
   ├─ activity_main.xml
   ├─ activity_details.xml
   └─ recycler_row.xml
```

### Kotlin Versiyonu (Yeni)
```
├─ MainActivity.kt (Tüm UI Compose'da)
├─ MainScreen.kt (Ana liste ekranı)
├─ DetailsScreen.kt (Detay ekranı)
├─ Landmark.kt (Kotlin data class)
└─ Theme.kt (Tema tanımları)
```

## 🎨 Ekranlar

### 1. **MainScreen / Ana Listeleme Ekranı**
- Tüm Landmark'ları dikey liste olarak gösterir
- Her Landmark kartında:
  - Sol taraf resmi
  - Orta alan: Landmark adı
  - Sağ taraf resmi
- Kartlara tıklanınca DetailScreen'e gidilir

### 2. **DetailsScreen / Detay Ekranı**
- Seçilen Landmark'ın tam bilgisini gösterir
- Geri dönme butonu ile MainScreen'e dönebilir
- Bilgiler:
  - Büyük resim
  - Landmark adı
  - Bulunduğu ülke

## 🔄 Navigasyon Akışı

```
MainActivity
    ↓
    NavHost (Navigation Container)
    ↓
    ├─→ MainScreen
    │      ↓
    │   (Tıkla) → DetailsScreen
    │                  ↓
    │           (Geri) → MainScreen
    │
    └─→ DetailsScreen
```

## 💡 Kotlin + Compose Avantajları

### 1. **Modern ve Stabil Dil**
- Null safety - Null pointer exception'ları engelleyen tip sistemi
- Extension functions - İşlevleri kolaylaştıran yapılar
- Data classes - Otomatik toString(), equals(), hashCode()
- Coroutines - Asenkron programlama

### 2. **Deklaratif UI**
- UI = f(state) - Durum değişince UI otomatik güncellenirse
- XML yazarken hata yapmak daha zor (compile-time safety)
- Hot reload ile gerçek zamanlı preview

### 3. **Daha Az Kod**
- RecyclerView adapter yazmasına gerek yok
- XML layout dosyalarına gerek yok
- View binding yazmasına gerek yok

### 4. **Material Design 3**
- En güncel Material Design özellikleri

## 📝 Landmark Veri Yapısı

```kotlin
data class Landmark(
    val name: String,        // Landmark adı (ör: "Pisa")
    val country: String,     // Ülke (ör: "Italy")
    val imageRes: Int        // Resim kaynağı
)
```

## 🎬 Kullanıcı Deneyimi

### Uygulama Akışı

1. **Uygulama Açılır**
   - MainActivity onCreate() çalışır
   - Navigation Container kurulur
   - MainScreen gösterilir

2. **Ana Ekran (MainScreen)**
   - LazyColumn'da Landmark'lar listelenir
   - Her kart Material3 Card'ı kullanır
   - Kart tıklandığında Index ile DetailsScreen'e yönlendir

3. **Detay Ekranı (DetailsScreen)**
   - Landmark bilgilerini gösterir
   - Back butonu ile geri dön
   - Material Design 3 TopAppBar kullanılır

## 🛠️ Kurulum ve Çalıştırma

### Gereksinimler
- Android Studio Flamingo veya daha yeni
- Android SDK 24+
- Kotlin 1.9.10+

### Adımlar
1. Projeyi Android Studio'da aç
2. Gradle senkronizasyonunu bekle
3. Emülatör veya fiziksel cihazı bağla
4. `Shift + F10` tuşu ile çalıştır

## 📚 Öğrenme Kaynakları

### Kotlin
- [Kotlin Official Documentation](https://kotlinlang.org/docs/)
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)

### Jetpack Compose
- [Compose Documentation](https://developer.android.com/jetpack/compose/documentation)
- [Material Design 3 Compose](https://m3.material.io/)

### Android Jetpack
- [Android Jetpack Navigation](https://developer.android.com/jetpack/androidx/releases/navigation)

## 🤝 Katkılar

Hocam; Atıl Samancıoğlu'na teşekkürlerimi sunarım.
Bu proje, öğrenme amacıyla Nuri tarafından açılmıştır.

## 📄 Lisans

MIT License

---

**Nuri ile GitHub Copilot tarafından oluşturulmuştur!** 🚀

