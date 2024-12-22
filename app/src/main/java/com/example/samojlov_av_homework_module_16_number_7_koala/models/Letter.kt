package com.example.samojlov_av_homework_module_16_number_7_koala.models

data class Letter(val address: String, val subject: String, val text: String) {

    companion object {
        val listOfLetter = listOf(
            Letter(
                "ШКОЛА ЧАРОДЕЙСТВА И ВОЛШЕБСТВА «ХОГВАРТС»",
                "Гарри Поттеру о зачислении в Хогвартс",
                "ШКОЛА ЧАРОДЕЙСТВА И ВОЛШЕБСТВА «ХОГВАРТС»\n" +
                        "Директор: Альбус Дамблдор\n" +
                        "(Кавалер ордена Мерлина I степени, Великий волшебник, Верховный чародей, Президент Международной конфедерации магов)\n" +
                        "Дорогой мистер Поттер!\n" +
                        "\n" +
                        "Мы рады проинформировать Вас, что Вам предоставлено место в Школе чародейства и волшебства «Хогвартс». Пожалуйста, ознакомьтесь с приложенным к данному письму списком необходимых книг и предметов.\n" +
                        "Занятия начинаются 1 сентября. Ждём вашу сову не позднее 31 июля.\n" +
                        "Искренне Ваша, Минерва МакГонагалл, заместитель директора!"
            ),
            Letter(
                "Рубеус Хагрид",
                "Письмо Рубеуса Хагрида Гарри Поттеру",
                "Дорогой Гарри. Я знаю, что в пятницу после обеда у тебя нет занятий, поэтому, если захочешь, приходи ко мне на чашку чая примерно часам к трем. Хочу знать, как прошла твоя первая неделя в школе. Пришли мне ответ с Буклей.\n" +
                        "Хагрид\n"
            ),
            Letter(
                "Минерва Макгонагалл",
                "Письмо Минервы Макгонагалл Гарри Поттеру",
                "НЕ ОТКРЫВАЙТЕ СВЕРТОК ЗА СТОЛОМ. В нем ваша новая метла, «Нимбус-2000», но я не хочу, чтобы все знали об этом, потому что в противном случае все первокурсники начнут просить, чтобы им разрешили иметь личные метлы. В семь часов вечера Оливер Вуд ждет вас на площадке для квиддича, где пройдет первая тренировка.\n" +
                        "Профессор М. МакГонагалл\n"
            ),
            Letter(
                "Минерва Макгонагалл",
                "Записки Гарри, Гермионе, Драко и Невиллу от профессора Макгонагалл с оповещением об отбытии наказания",
                "Для отбытия наказания будьте сегодня в одиннадцать часов вечера у выхода из школы. Там вас будет ждать мистер Филч.\n" +
                        "Проф. М. Макгонагалл\n"
            ),
            Letter(
                "Министерство магии",
                "Письмо из Министерства магии на имя Гарри Поттера",
                "Дорогой мистер Поттер!\n" +
                        "\n" +
                        "Мы получили донесение, что в месте Вашего проживания сегодня вечером в двадцать один час двенадцать минут было применено заклинание Левитации.\n" +
                        "Как Вам известно, несовершеннолетним волшебникам не разрешено вне школы использовать приемы чародейства. Ещё одна такая провинность, и Вас исключат из вышеупомянутой школы согласно Указу, предусматривающему разумное ограничение волшебства несовершеннолетних (1875 г., параграф С).\n" +
                        "Также напоминаем, что любой акт волшебства, способный привлечь внимание не умеющего колдовать сообщества (маглы), является серьёзным нарушением закона согласно Статусу секретности Международной конфедерации колдунов и магов.\n" +
                        "Счастливых каникул!\n" +
                        "Искренне Ваша, Муфалда Хмелкирк\n" +
                        "Сектор борьбы с неправомерным использованием магии\n" +
                        "Министерство магии"
            ),
            Letter(
                "Рон Уизли",
                "Письма Рона Уизли, Гермионы Грейнджер и Рубеуса Хагрида Гарри содержащие поздравления с днем рождения",
                "Привет, Гарри!Поздравляю тебя с днём рождения! Извини, что так вышло с телефонным звонком. Надеюсь, маглы не очень ругались? Папа сказал, что, наверное, не надо было так сильно кричать в трубку.\n" +
                        "В Египте чудесно! Билл повёл нас на экскурсию по пирамидам. Не представляешь, какие страшные заклятия наложили на них египетские жрецы! Мама даже не пустила Джинни в последнюю пирамиду. Там столько жутких скелетов! Маглы вскрывают гробницы, и заклятия начинают действовать: у кого десять рук вырастет, у кого несколько голов!\n" +
                        "Я сначала и не поверил, что папа выиграл главный приз «Пророка» — целых семьсот галеонов! Конечно, много денег уйдёт на отпуск, но родители всё-таки обещали купить мне новую волшебную палочку.\n" +
                        "Мы приедем за неделю до начала учебного года и отправимся в Лондон. Надо купить палочку и учебники. Гарри, давай встретимся! Приезжай! Не обращай внимания на маглов. До встречи в Лондоне.\n" +
                        "Рон.\n" +
                        "P.S. На той неделе Перси получил из Хогвартса письмо. Он — лучший ученик и староста всей школы.\n"
            ),
            Letter(
                "Рубеус Хагрид",
                "Письмо Рубеуса Хагрида Гарри и Рону",
                "Как вы насчет того, чтобы выпить со мной чашку чая сегодня вечером около шести? Я зайду за вами в замок. ЖДИТЕ МЕНЯ В ХОЛЛЕ. ВАМ ОДНИМ ВЫХОДИТЬ ЗАПРЕЩЕНО.\n" +
                        "Не вешайте носа.\n" +
                        "Хагрид\n"
            ),
            Letter(
                "Рубеус Хагрид",
                "Письмо Рубеуса Хагрида Гарри, Рону и Гермионе",
                "Проиграл апелляцию. Казнь на закате. Вы ничего не можете сделать. Не приходите. Не хочу, чтобы вы это видели.\n" +
                        "Хагрид\n"
            ),
            Letter(
                "Сириус Блэк", "Письмо Сириуса Блэка Гарри Поттеру", "Дорогой Гарри!\n" +
                        "\n" +
                        "Надеюсь, ты получишь это письмо ещё до того, как встретишься с дядей и тётей. Не знаю, как они относятся к совиной почте.\n" +
                        "Мы с Клювокрылом в надёжном месте. Не хочу говорить где — на случай, если письмо попадёт не в те руки. Эта сова — не самый лучший почтальон. Но я не смог здесь найти ничего лучшего, и вдобавок, она, похоже, искала работу.\n" +
                        "Не сомневаюсь, что дементоры всё ещё рыщут в поисках моего следа, но сюда им не добраться. Хочу на днях мельком показаться одному-другому маглу, как можно дальше от Хогвартса. Так что охрану замка в ближайшее время снимут.\n" +
                        "Я кое-что не успел тебе рассказать во время нашей короткой встречи. Это я прислал тебе «Молнию». Живоглот отнёс мой заказ на почту от твоего имени. Но золото я распорядился взять в «Гринготтсе» из моего личного сейфа номер семьсот одиннадцать. Считай это подарком от крёстного отца за все тринадцать лет рождения.\n" +
                        "И прости меня, что я тебя напугал той ночью, год назад, когда ты ушёл из дома дяди. Я хотел хоть одним глазком взглянуть на тебя перед дальней дорогой на север. Но, боюсь, мой вид встревожил тебя.\n" +
                        "Посылаю ещё кое-что, это скрасит твой четвёртый год в Хогвартсе.\n" +
                        "Если я вдруг понадоблюсь, черкни словечко. Твоя сова доставит мне письмо.\n" +
                        "Вскоре напишу снова.\n" +
                        "Сириус\n"
            ),
            Letter(
                "Рон Уизли",
                "Письмо Рона Уизли Гарри Поттеру",
                "Гарри! Папа достал билеты! Ирландия против Болгарии, в понедельник вечером! Мама пишет маглам, чтобы те разрешили тебе остаться. Они уже могли получить письмо - не знаю, насколько магловская почта быстрая. Всё равно решил написать тебе. Отправляю это письмо с Сычиком.\n" +
                        "Мы приедем за тобой, нравится маглам это или нет; ты не можешь пропустить Кубок мира. Но мама и папа считают, что сначала для вида надо всё-таки спросить их разрешения. Если они согласятся, срочно присылай Сычика с ответом — мы приедем и заберём тебя в воскресенье, в пять часов. Если они скажут «нет», опять-таки быстро присылай Сычика, и мы всё равно увезём тебя в пять часов в воскресенье.\n" +
                        "Гермиона приезжает сегодня днём. Перси приступил к работе в Департаменте международного магического сотрудничества. Пока будешь у нас, не упоминай даже слова «заграница», если не хочешь, чтобы он заговорил тебя до смерти.\n" +
                        "До скорой встречи, Рон\n"
            )
        )

    }

}