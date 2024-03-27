import React from 'react'
import axios from 'axios'
import { useForm } from 'react-hook-form'
import { yupResolver } from '@hookform/resolvers/yup'
import * as yup from 'yup'

const api = 'http://localhost:8080/login'

export const login = () => {
    const formSchema = yup.object({
        username: yup.string().required("Username is required"),
        password: yup.string().required('Password is required'),
    })

    const {
        register, handleSubmit, formState: { errors },
    } = useForm({
        resolver: yupResolver(formSchema)
    })


  return (
    <div>
        <form onSubmit={handleSubmit()}>
            <div class = "userlogin">
                <label > Username</label>
                <input type="email" name='username' {...register('username')}/>
                <p>{errors.username?.message}</p>
            </div>
            <div class = "passlogin">
                <label > Password</label>
                <input type="text" name='password'{...register('password')}/>
                <p>{errors.password?.message}</p>
            </div>
            <input type="submit" value= "Log in" />
        </form>
    </div>
  )
}

export default login;
