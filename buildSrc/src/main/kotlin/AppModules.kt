import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

object AppModules {

    fun DependencyHandlerScope.withNetworkModule() =
        add("api", project(":network"))

    fun DependencyHandlerScope.withCoreModule() =
        add("api", project(":core"))
}

object Payments {

    fun DependencyHandlerScope.withPaymentModelModule() =
        add("implementation", project(":payment:payment-model"))

    fun DependencyHandlerScope.withPaymentDomainModule() =
        add("implementation", project(":payment:payment-domain"))

    fun DependencyHandlerScope.withPaymentPresentationModule() =
        add("implementation", project(":payment:payment-presentation"))

    fun DependencyHandlerScope.withPaymentModule(){
        add("implementation", project(":payment:payment-domain"))
        add("implementation", project(":payment:payment-model"))
        add("implementation", project(":payment:payment-presentation"))
    }
}