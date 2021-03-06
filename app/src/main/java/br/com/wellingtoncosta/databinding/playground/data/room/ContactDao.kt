package br.com.wellingtoncosta.databinding.playground.data.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import br.com.wellingtoncosta.databinding.playground.domain.Contact
import io.reactivex.Maybe

/**
 * @author WellingtonCosta on 18/07/18
 */
@Dao
interface ContactDao {

    @Insert
    fun insert(contact: Contact)

    @Query("SELECT * FROM contact")
    fun listAll(): Maybe<List<Contact>>

}