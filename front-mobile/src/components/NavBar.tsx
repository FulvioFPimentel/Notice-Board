import React, { useState } from 'react';
import { useNavigation, useRoute } from '@react-navigation/native';
import { TouchableOpacity, Image, Text, View } from 'react-native'
import menu from '../assets/icons/menu.png'
import { nav } from '../styles'
import Routes from '../routes';

export type titleScreen = {
    screen: Function;
}

const NavBar: React.FC = () => {

    const [ show, setShow ] = useState(false);

    const navigation = useNavigation();
    const route = useRoute();

    function navigate(path: any) {
        if(path){
            setShow(false);
            navigation.navigate(path);
        }
        setShow(false);
    }

    function addScreen(page: string) {

    }


    return (
        <TouchableOpacity activeOpacity={0.6} style={nav.drawer} onPress={() => setShow(!show)}>
            
            {
                show ? (<View style={nav.options} >
                    
                    <TouchableOpacity style={nav.option} onPress={() => navigate("Notice")} onPressIn={() => (addScreen("Quadro de Anúncios"))}>
                        <Text style={[nav.textOption, route.name == "Notice"
                        ? nav.textActive : null ]}>Quadro de Anúncios</Text>
                    </TouchableOpacity>

                    <TouchableOpacity style={nav.option} onPress={() => navigate("Meetings")}>
                        <Text style={[nav.textOption, route.name == "Meetings"
                        ? nav.textActive : null]}>Reuniões</Text>
                       
                    </TouchableOpacity>

                    <TouchableOpacity style={nav.option}>
                        <Text style={[nav.textOption, route.name == "Details"
                        ? nav.textActive : null]}>Atividades Mecanicas</Text>
                    </TouchableOpacity>

                    <TouchableOpacity style={nav.option}>
                        <Text style={[nav.textOption, route.name == "Details"
                        ? nav.textActive : null]}>Minhas designações</Text>
                    </TouchableOpacity>

                </View>) : <Image source={menu} />
            }
        </TouchableOpacity>
    );
}

export default NavBar;