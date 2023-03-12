Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах
Для каждого сформировать список свойств и возможных действий. Например, свойство скорость, действие нанести удар. Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. В основной программе создать по одному экземпляру каждого типа персонажей.

Показатели (либо privat, либо protected):
    baseUnit:
        hp
        hitDamage
        speed


        Infantry:
            --//--
            CountryMan
                hp = 50
                hitDamage = 10
                speed = 6
            Robber
                hp = 60
                hitDamage = 15
                speed = 8
            Spearman
                hp = 70
                hitDamage = 20
                speed = 7

        Shooters:
            arrowDamage
            arrowQty
            Sniper
                hp = 60
                hitDamage = 8
                speed = 6
                arrowDamage = 25
                arrowQty = 50
            CrossBowMan
                hp = 70
                hitDamage = 10
                speed = 5
                arrowDamage = 18
                arrowQty = 80

        Magiс:
            magicDamage
            magicQty
            Wizard
                hp = 70
                hitDamage = 10
                speed = 8
                magicDamage = 28
                arrowQty = 50
            Magician
                hp = 70
                hitDamage = 10
                speed = 7
                magicDamage = 30
                arrowQty = 50


Действия
    Attack
    GetAttack
    Heal
    SpecialAction
    Move
    



