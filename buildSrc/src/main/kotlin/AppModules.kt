import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

object AppModules {

    fun DependencyHandlerScope.withNetworkModule() =
        add("api", project(":network"))
}

object Payments {

    fun DependencyHandlerScope.withPaymentsModelModule() =
        add("implementation", project(":payment:payment-model"))

    fun DependencyHandlerScope.withPaymentsDomainModule() =
        add("implementation", project(":payment:payment-domain"))
}