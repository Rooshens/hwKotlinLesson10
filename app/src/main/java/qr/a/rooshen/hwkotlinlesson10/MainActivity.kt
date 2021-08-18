package qr.a.rooshen.hwkotlinlesson10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import qr.a.rooshen.hwkotlinlesson10.database.User


class MainActivity : AppCompatActivity(), MainNavigation {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        if (SharePrefHelper.instance.getBoolean("notShowItAnymore", false)) {
            openAuthorizationFragmentNotShowItAnymore()
        } else {
            openGreeting()
        }

    }

    override fun openGreeting() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRootActivity, GreetingFragment())
            .commit()
    }

    override fun openAuthorizationFragmentNotShowItAnymore() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRootActivity, AuthorizationFragment())
            .commit()
    }

    override fun openMenu() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, MenuFragment())
            .addToBackStack("Menu")
            .commit()
    }

    override fun openMenuList() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, MenuListFragment())
            .commit()
    }

    override fun openMenuListContainerMenu() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flContainerMenu, MenuListFragment())
            .commit()
    }

    override fun openDialogBasket() {
        DialogBasket().show(supportFragmentManager, "BottomTest")
    }

    override fun openAuthorizationFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, AuthorizationFragment())
            .addToBackStack("AuthorizationFragment")
            .commit()
    }

    override fun openBasketFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, BasketFragment.newInstance(phoneNumber))
            .addToBackStack("BasketFragment")
            .commit()
    }

}