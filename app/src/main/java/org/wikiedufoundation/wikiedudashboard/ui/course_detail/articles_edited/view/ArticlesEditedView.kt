package org.wikiedufoundation.wikiedudashboard.ui.course_detail.articles_edited.view

import org.wikiedufoundation.wikiedudashboard.ui.course_detail.articles_edited.data.ArticlesEdited

import org.wikiedufoundation.wikiedudashboard.util.Progressive
import org.wikiedufoundation.wikiedudashboard.util.Toaster

interface ArticlesEditedView : Progressive, Toaster {
    fun setData(data: ArticlesEdited)
}
