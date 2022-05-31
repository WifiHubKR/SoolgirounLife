package c.myapplication.soolgirounlife

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import c.myapplication.soolgirounlife.databinding.CustomPlusMinusBarBinding
import c.myapplication.soolgirounlife.databinding.CustomSwitchButtonBinding

open class CustomSwitchButton @JvmOverloads constructor(context: Context, var attrs: AttributeSet?) : ConstraintLayout(context, attrs) {
    private val binding: CustomSwitchButtonBinding = CustomSwitchButtonBinding.inflate(
        LayoutInflater.from(context), this, true)

    init {
        binding.leftSwitchButton.setOnClickListener {
            binding.leftSwitchButton.setBackgroundResource(R.drawable.left_border_radius_rectangle)
            binding.rightSwitchButton.setBackgroundResource(R.drawable.right_border_radius_gray_rectangle)
        }

        binding.rightSwitchButton.setOnClickListener {
            binding.leftSwitchButton.setBackgroundResource(R.drawable.left_border_radius_gray_rectangle)
            binding.rightSwitchButton.setBackgroundResource(R.drawable.right_border_radius_rectangle)
        }
    }
}