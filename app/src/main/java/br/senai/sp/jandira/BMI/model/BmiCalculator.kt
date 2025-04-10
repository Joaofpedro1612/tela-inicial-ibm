package br.senai.sp.jandira.BMI.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.BMI.R
import kotlin.math.pow

@Composable
fun bmicalculator(wheight: Int, height: Double): Bmi{
    val bmi = wheight.div(height.div(100).pow(2))

    when{
        bmi < 18.5 ->
           return Bmi(
                color = colorResource(R.color.light_blue),
                status = BmiStatus.UNDER_WHEIGHT,
                bmiValues = Pair(stringResource(R.string.under_wheight), bmi)
            )

        bmi >= 18.5 && bmi < 25.0  ->
          return  Bmi(
                color = colorResource(R.color.light_green),
                status = BmiStatus.NORMAL,
                bmiValues = Pair(stringResource(R.string.normal_wheight), bmi)
            )

        bmi >= 25.0 && bmi < 30.0  ->
            return  Bmi(
                color = colorResource(R.color.yellow),
                status = BmiStatus.OVER_WHEIGHT,
                bmiValues = Pair(stringResource(R.string.over_wheight), bmi)
            )

        bmi >= 30.0 && bmi < 35.0  ->
            return  Bmi(
                color = colorResource(R.color.light_orange),
                status = BmiStatus.OBESITY_1,
                bmiValues = Pair(stringResource(R.string.class1_wheight), bmi)
            )

        bmi >= 35.0 && bmi < 40.0  ->
            return  Bmi(
                color = colorResource(R.color.dark_orange),
                status = BmiStatus.OBESITY_2,
                bmiValues = Pair(stringResource(R.string.class2_wheight), bmi)
            )
        else ->
        return  Bmi(
            color = colorResource(R.color.red),
            status = BmiStatus.OBESITY_3,
            bmiValues = Pair(stringResource(R.string.class3_wheight), bmi)
        )

    }

}